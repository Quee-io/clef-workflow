package io.quee.clef.workflow.api.store.element.query

import io.arkitik.radix.develop.store.query.StoreQuery
import io.quee.clef.workflow.api.domain.element.flow.ElementFlowIdentity

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **19**, **Thu Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
interface ElementFlowStoreQuery : StoreQuery<String, ElementFlowIdentity>