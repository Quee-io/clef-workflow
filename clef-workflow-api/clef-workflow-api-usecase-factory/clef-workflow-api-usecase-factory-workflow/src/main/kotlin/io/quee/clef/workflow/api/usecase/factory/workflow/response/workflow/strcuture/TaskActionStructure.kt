package io.quee.clef.workflow.api.usecase.factory.workflow.response.workflow.strcuture

import io.quee.api.develop.shared.model.IdentityStatus
import io.quee.api.develop.usecase.model.UseCaseResponse
import io.quee.clef.workflow.api.common.response.ViewIdentify

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **14**, **Sat Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
class TaskActionStructure(
        val actionUuid: String,
        val actionKey: String,
        val actionName: String,
        val status: IdentityStatus,
        val actionDescription: String,
        val destinationTask: ViewIdentify
) : UseCaseResponse