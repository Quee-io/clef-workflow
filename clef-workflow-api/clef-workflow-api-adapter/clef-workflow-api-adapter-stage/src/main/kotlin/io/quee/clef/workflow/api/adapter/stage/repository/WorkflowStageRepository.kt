package io.quee.clef.workflow.api.adapter.stage.repository

import io.quee.clef.workflow.api.adapter.entity.workflow.StageTask
import io.quee.clef.workflow.api.adapter.entity.workflow.WorkflowStage
import io.quee.clef.workflow.api.adapter.shared.repository.MainRepository
import org.springframework.stereotype.Repository

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **18**, **Wed Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
@Repository
interface WorkflowStageRepository : MainRepository<WorkflowStage> {
    fun findByStageKeyAndUuid(workflowKey: String, uuid: String): WorkflowStage?
    fun existsByStageKey(workflowKey: String): Boolean

    fun findByTasksInOrInitialTaskIn(tasks: List<StageTask>, initialTask: List<StageTask>): WorkflowStage?
}