package io.quee.clef.workflow.api.usecase.factory.workflow.request.task

import io.quee.api.develop.usecase.model.UseCaseRequest
import io.quee.clef.workflow.api.usecase.factory.workflow.identify.ViewIdentify

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **13**, **Fri Mar, 2020**
 * Project [**clef-workflow**](https://pazar.store/)<br></br>
 */
interface CreateTaskRequest : UseCaseRequest {
    val taskKey: String
    val taskName: String
    val initialTask: Boolean
    val stage: ViewIdentify
}