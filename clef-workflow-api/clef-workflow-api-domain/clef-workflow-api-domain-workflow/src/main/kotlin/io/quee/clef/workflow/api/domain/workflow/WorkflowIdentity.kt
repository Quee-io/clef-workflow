package io.quee.clef.workflow.api.domain.workflow

import io.quee.api.develop.shared.model.Identity
import io.quee.clef.workflow.api.domain.workflow.stage.WorkflowStageIdentity

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **13**, **Fri Mar, 2020**
 * Project [**clef-workflow**](https://pazar.store/)<br></br>
 */
interface WorkflowIdentity : Identity {
    val workflowKey: String

    val workflowName: String

    val workflowDescription: String

    val initialStage: WorkflowStageIdentity

    val stages: MutableList<WorkflowStageIdentity>
}