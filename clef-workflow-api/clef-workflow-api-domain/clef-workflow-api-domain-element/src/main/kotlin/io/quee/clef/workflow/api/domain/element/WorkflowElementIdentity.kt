package io.quee.clef.workflow.api.domain.element

import io.quee.api.develop.shared.model.Identity
import io.quee.clef.workflow.api.domain.workflow.WorkflowIdentity
import io.quee.clef.workflow.api.domain.workflow.stage.StageIdentity
import io.quee.clef.workflow.api.domain.workflow.stage.task.StageTaskIdentity

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **13**, **Fri Mar, 2020**
 * Project [**clef-workflow**](https://pazar.store/)<br></br>
 */
interface WorkflowElementIdentity : Identity {
    val elementKey: String
    val workflow: WorkflowIdentity
    val currentStage: StageIdentity
    val currentTask: StageTaskIdentity
}