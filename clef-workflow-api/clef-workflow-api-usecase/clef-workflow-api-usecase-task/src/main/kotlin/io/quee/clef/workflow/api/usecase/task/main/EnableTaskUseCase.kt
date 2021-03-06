package io.quee.clef.workflow.api.usecase.task.main

import io.quee.api.develop.action.usecase.validation.ValidationFunctionalUseCase
import io.quee.api.develop.shared.model.IdentityStatus
import io.quee.clef.workflow.api.common.error.StageTaskResponses
import io.quee.clef.workflow.api.common.response.SharedResponse
import io.quee.clef.workflow.api.function.shared.IdentityStatusValidation
import io.quee.clef.workflow.api.store.task.StageTaskStore
import io.quee.clef.workflow.api.usecase.factory.domain.StageTaskDomainUseCaseFactory
import io.quee.clef.workflow.api.usecase.factory.domain.request.FindDomainByKeyAndUuidRequest
import io.quee.clef.workflow.api.usecase.factory.workflow.request.task.TaskRequest

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **16**, **Mon Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
class EnableTaskUseCase(
        private val taskStore: StageTaskStore,
        private val identityStatusValidation: IdentityStatusValidation,
        private val taskDomainUseCaseFactory: StageTaskDomainUseCaseFactory
) : ValidationFunctionalUseCase<TaskRequest, SharedResponse>() {
    override fun TaskRequest.realProcess(): SharedResponse {
        val stageTaskIdentity = taskDomainUseCaseFactory.findStageTaskByKeyAndUuidUseCase
                .run {
                    FindDomainByKeyAndUuidRequest.instance(taskKey, taskUuid, true)
                            .process()
                            .response
                }
        stageTaskIdentity.identityStatus.validate()
        taskStore.run {
            stageTaskIdentity.identityUpdater()
                    .enable()
                    .update()
                    .save()
        }
        return StageTaskResponses.TASK_ENABLED_SUCCESS
    }

    private fun IdentityStatus.validate() {
        identityStatusValidation.run {
            validate(IdentityStatus.ENABLED)
        }
    }
}