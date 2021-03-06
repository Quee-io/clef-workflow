package io.quee.clef.workflow.api.contract.action

import io.quee.clef.workflow.api.common.response.SharedResponse
import io.quee.clef.workflow.api.common.response.ViewIdentify
import io.quee.clef.workflow.api.contract.action.dto.CreateTaskActionRequestDto
import io.quee.clef.workflow.api.contract.shared.Contract
import io.quee.clef.workflow.api.contract.shared.dto.ContractResponse
import io.quee.clef.workflow.api.usecase.factory.workflow.response.action.TaskActionDetails

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **17**, **Tue Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
interface ActionContract : Contract {
    fun CreateTaskActionRequestDto.create(): ContractResponse<ViewIdentify>

    fun details(key: String, uuid: String): ContractResponse<TaskActionDetails>

    fun enable(key: String, uuid: String): ContractResponse<SharedResponse>

    fun disable(key: String, uuid: String): ContractResponse<SharedResponse>

    fun delete(key: String, uuid: String): ContractResponse<SharedResponse>
}