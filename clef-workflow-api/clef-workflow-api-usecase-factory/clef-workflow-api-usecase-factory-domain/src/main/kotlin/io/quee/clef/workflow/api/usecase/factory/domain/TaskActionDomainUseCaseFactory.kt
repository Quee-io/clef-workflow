package io.quee.clef.workflow.api.usecase.factory.domain

import io.quee.api.develop.usecase.factory.UseCaseFactory
import io.quee.api.develop.usecase.model.RequestAdapter
import io.quee.api.develop.usecase.model.ResponseAdapter
import io.quee.api.develop.usecase.type.CommandUseCase
import io.quee.api.develop.usecase.type.FunctionalUseCase
import io.quee.clef.workflow.api.domain.workflow.stage.action.TaskActionIdentity
import io.quee.clef.workflow.api.usecase.factory.domain.request.ExistByKeyRequest
import io.quee.clef.workflow.api.usecase.factory.domain.request.FindDomainByKeyAndUuidRequest

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **15**, **Sun Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
interface TaskActionDomainUseCaseFactory : UseCaseFactory {
    val findTaskActionByKeyAndUuidUseCase: FunctionalUseCase<FindDomainByKeyAndUuidRequest, ResponseAdapter<TaskActionIdentity>>
    val validateTaskActionExistenceUseCase: CommandUseCase<ExistByKeyRequest>
    val deleteAllActionsUseCase: CommandUseCase<RequestAdapter<List<TaskActionIdentity>>>
}