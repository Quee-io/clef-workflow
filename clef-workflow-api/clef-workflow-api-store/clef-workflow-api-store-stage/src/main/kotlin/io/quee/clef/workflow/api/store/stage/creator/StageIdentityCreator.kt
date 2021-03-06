package io.quee.clef.workflow.api.store.stage.creator

import io.quee.api.develop.store.StoreIdentityCreator
import io.quee.clef.workflow.api.domain.workflow.stage.StageIdentity

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **14**, **Sat Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
interface StageIdentityCreator : StoreIdentityCreator<StageIdentity> {
    fun String.stageKey(): StageIdentityCreator
    fun String.stageName(): StageIdentityCreator
}