package io.quee.clef.workflow.api.store.element.query

import io.quee.api.develop.store.StoreQuery
import io.quee.clef.workflow.api.domain.element.ElementIdentity

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **19**, **Thu Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
interface ElementStoreQuery : StoreQuery<ElementIdentity> {
    fun findByKeyAndUuid(
            elementKey: String,
            elementUuid: String
    ): ElementIdentity?

    fun existByKey(elementKey: String): Boolean
}