package io.quee.clef.workflow.api.domain.workflow.stage.action

import io.quee.api.develop.shared.model.Identity
import io.quee.clef.workflow.api.domain.workflow.stage.task.StageTaskIdentity

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **13**, **Fri Mar, 2020**
 * Project [**clef-workflow**](https://pazar.store/)<br></br>
 */
interface TaskActionIdentity : Identity {
    val taskKey: String
    val taskName: String
    val sourceTask: StageTaskIdentity
    val destinationTask: StageTaskIdentity
}