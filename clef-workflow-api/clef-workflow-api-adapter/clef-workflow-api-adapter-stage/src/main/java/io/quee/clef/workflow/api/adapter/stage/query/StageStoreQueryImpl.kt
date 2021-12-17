package io.quee.clef.workflow.api.adapter.stage.query

import io.arkitik.radix.adapter.shared.query.StoreQueryImpl
import io.quee.clef.workflow.api.entity.workflow.StageTask
import io.quee.clef.workflow.api.entity.workflow.WorkflowStage
import io.quee.clef.workflow.api.adapter.stage.repository.WorkflowStageRepository
import io.quee.clef.workflow.api.domain.workflow.stage.StageIdentity
import io.quee.clef.workflow.api.domain.workflow.stage.task.StageTaskIdentity
import io.quee.clef.workflow.api.store.stage.query.StageStoreQuery

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **18**, **Wed Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
class StageStoreQueryImpl(
    private val workflowStageRepository: WorkflowStageRepository,
) : StoreQueryImpl<String, StageIdentity, WorkflowStage>(workflowStageRepository), StageStoreQuery {
    override fun findByKeyAndUuid(stageKey: String): StageIdentity? =
        workflowStageRepository.findByStageKey(stageKey)

    override fun existByKey(stageKey: String): Boolean =
        workflowStageRepository.existsByStageKey(stageKey)

    override fun findByTask(stageTaskIdentity: StageTaskIdentity): StageIdentity? {
        val tasks = listOf(stageTaskIdentity as StageTask)
        return workflowStageRepository.findByTasksInOrInitialTaskIn(tasks, tasks)
    }
}