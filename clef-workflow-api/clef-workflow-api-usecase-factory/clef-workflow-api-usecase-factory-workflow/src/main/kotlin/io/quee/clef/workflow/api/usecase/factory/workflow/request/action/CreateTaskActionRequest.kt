package io.quee.clef.workflow.api.usecase.factory.workflow.request.action

import io.quee.api.develop.usecase.model.UseCaseRequest
import io.quee.clef.workflow.api.usecase.factory.workflow.identify.ViewIdentify
import javax.validation.Valid
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **13**, **Fri Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
interface CreateTaskActionRequest : UseCaseRequest {

    @get:NotBlank
    val taskKey: String

    @get:NotBlank
    val taskName: String

    @get:NotBlank
    val taskDescription: String

    @get:NotNull
    @get:Valid
    val sourceTask: ViewIdentify

    @get:NotNull
    @get:Valid
    val destinationTask: ViewIdentify
}