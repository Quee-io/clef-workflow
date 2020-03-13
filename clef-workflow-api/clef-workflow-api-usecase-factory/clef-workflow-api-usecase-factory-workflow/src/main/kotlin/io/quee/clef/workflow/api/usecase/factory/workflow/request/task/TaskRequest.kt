package io.quee.clef.workflow.api.usecase.factory.workflow.request.task

import io.quee.api.develop.usecase.model.UseCaseRequest
import io.quee.clef.workflow.api.usecase.factory.workflow.request.stage.StageRequest

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **13**, **Fri Mar, 2020**
 * Project [**clef-workflow**](https://pazar.store/)<br></br>
 */
interface TaskRequest<T : UseCaseRequest> : StageRequest<T> {
    val taskKey: String
    val taskUuid: String
}