package io.quee.clef.workflow.api.controller.workflow.api

import io.quee.clef.workflow.api.common.response.SharedResponse
import io.quee.clef.workflow.api.common.response.ViewIdentify
import io.quee.clef.workflow.api.contract.shared.dto.ContractResponse
import io.quee.clef.workflow.api.contract.workflow.dto.CreateWorkflowRequestDto
import io.quee.clef.workflow.api.controller.workflow.contract.WorkflowApiContract
import io.quee.clef.workflow.api.usecase.factory.workflow.response.workflow.FullWorkflowStructure
import io.quee.clef.workflow.api.usecase.factory.workflow.response.workflow.WorkflowDetailsResponse
import io.quee.clef.workflow.integration.engine.ClefWorkflowEngine
import org.springframework.web.bind.annotation.RestController

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **17**, **Tue Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
@RestController
class WorkflowApiController(private val clefWorkflowEngine: ClefWorkflowEngine) : WorkflowApiContract {
    override fun CreateWorkflowRequestDto.create(): ContractResponse<ViewIdentify> {
        return clefWorkflowEngine.workflowContract
                .run {
                    create()
                }
    }

    override fun details(key: String, uuid: String): ContractResponse<WorkflowDetailsResponse> {
        return clefWorkflowEngine.workflowContract.details(key, uuid)
    }

    override fun structure(): ContractResponse<FullWorkflowStructure> {
        return clefWorkflowEngine.workflowContract.structure()
    }

    override fun enable(key: String, uuid: String): ContractResponse<SharedResponse> {
        return clefWorkflowEngine.workflowContract.enable(key, uuid)
    }

    override fun disable(key: String, uuid: String): ContractResponse<SharedResponse> {
        return clefWorkflowEngine.workflowContract.disable(key, uuid)
    }

    override fun delete(key: String, uuid: String): ContractResponse<SharedResponse> {
        return clefWorkflowEngine.workflowContract.delete(key, uuid)
    }
}