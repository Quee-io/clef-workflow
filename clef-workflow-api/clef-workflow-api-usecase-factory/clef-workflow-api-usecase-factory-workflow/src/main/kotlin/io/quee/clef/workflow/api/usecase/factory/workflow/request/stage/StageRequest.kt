package io.quee.clef.workflow.api.usecase.factory.workflow.request.stage

import io.quee.api.develop.usecase.model.UseCaseRequest
import javax.validation.constraints.NotBlank

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **13**, **Fri Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
interface StageRequest : UseCaseRequest {
    @get:NotBlank
    val stageKey: String

    @get:NotBlank
    val stageUuid: String
}