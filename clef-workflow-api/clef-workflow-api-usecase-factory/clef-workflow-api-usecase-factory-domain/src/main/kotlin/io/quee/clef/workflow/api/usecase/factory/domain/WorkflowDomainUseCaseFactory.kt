package io.quee.clef.workflow.api.usecase.factory.domain

import io.quee.api.develop.usecase.factory.UseCaseFactory
import io.quee.api.develop.usecase.model.RequestAdapter
import io.quee.api.develop.usecase.model.ResponseAdapter
import io.quee.api.develop.usecase.type.CommandUseCase
import io.quee.api.develop.usecase.type.FunctionalUseCase
import io.quee.clef.workflow.api.domain.workflow.WorkflowIdentity
import io.quee.clef.workflow.api.domain.workflow.stage.StageIdentity
import io.quee.clef.workflow.api.usecase.factory.domain.request.AddStageToWorkflowRequest
import io.quee.clef.workflow.api.usecase.factory.domain.request.ExistByKeyRequest
import io.quee.clef.workflow.api.usecase.factory.domain.request.FindDomainByKeyAndUuidRequest

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **15**, **Sun Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
interface WorkflowDomainUseCaseFactory : UseCaseFactory {
    val findWorkflowByKeyAndUuidUseCase: FunctionalUseCase<FindDomainByKeyAndUuidRequest, ResponseAdapter<WorkflowIdentity>>
    val findWorkflowByStageUseCase: FunctionalUseCase<RequestAdapter<StageIdentity>, ResponseAdapter<WorkflowIdentity>>
    val validateWorkflowExistenceUseCase: CommandUseCase<ExistByKeyRequest>
    val addStageToWorkflowUseCase: CommandUseCase<AddStageToWorkflowRequest>
    val deleteAllWorkflowUseCase: CommandUseCase<RequestAdapter<List<WorkflowIdentity>>>
}