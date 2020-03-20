package io.quee.clef.workflow.api.usecase.factory.element.domain.request

import io.quee.api.develop.usecase.model.UseCaseRequest

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **15**, **Sun Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
interface ElementExistByKeyRequest : UseCaseRequest {
    val domainKey: String

    companion object {
        fun instance(domainKey: String): ElementExistByKeyRequest {
            return object : ElementExistByKeyRequest {
                override val domainKey: String = domainKey
            }
        }
    }
}