package io.quee.clef.workflow.api.controller.action.api

import io.quee.clef.workflow.api.common.response.SharedResponse
import io.quee.clef.workflow.api.common.response.ViewIdentify
import io.quee.clef.workflow.api.contract.action.dto.CreateTaskActionRequestDto
import io.quee.clef.workflow.api.contract.shared.dto.ContractResponse
import io.quee.clef.workflow.api.controller.action.contract.ActionApiContract
import io.quee.clef.workflow.api.usecase.factory.workflow.response.action.TaskActionDetails
import io.quee.clef.workflow.integration.engine.ClefWorkflowEngine
import org.springframework.web.bind.annotation.RestController

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **18**, **Wed Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
@RestController
class ActionApiController(private val clefWorkflowEngine: ClefWorkflowEngine) : ActionApiContract {
    override fun CreateTaskActionRequestDto.create(): ContractResponse<ViewIdentify> {
        return clefWorkflowEngine.actionContract.run {
            create()
        }
    }

    override fun details(key: String, uuid: String): ContractResponse<TaskActionDetails> {
        return clefWorkflowEngine.actionContract.run {
            details(key, uuid)
        }
    }

    override fun enable(key: String, uuid: String): ContractResponse<SharedResponse> {
        return clefWorkflowEngine.actionContract.enable(key, uuid)
    }

    override fun disable(key: String, uuid: String): ContractResponse<SharedResponse> {
        return clefWorkflowEngine.actionContract.disable(key, uuid)
    }

    override fun delete(key: String, uuid: String): ContractResponse<SharedResponse> {
        return clefWorkflowEngine.actionContract.delete(key, uuid)
    }
}