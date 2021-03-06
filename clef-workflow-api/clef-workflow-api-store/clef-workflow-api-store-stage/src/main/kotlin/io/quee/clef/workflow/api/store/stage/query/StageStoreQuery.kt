package io.quee.clef.workflow.api.store.stage.query

import io.quee.api.develop.store.StoreQuery
import io.quee.clef.workflow.api.domain.workflow.stage.StageIdentity
import io.quee.clef.workflow.api.domain.workflow.stage.task.StageTaskIdentity

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **14**, **Sat Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
interface StageStoreQuery : StoreQuery<StageIdentity> {
    fun findByKeyAndUuid(
            stageKey: String,
            stageUuid: String
    ): StageIdentity?

    fun existByKey(stageKey: String): Boolean

    fun findByTask(stageTaskIdentity: StageTaskIdentity): StageIdentity?
}