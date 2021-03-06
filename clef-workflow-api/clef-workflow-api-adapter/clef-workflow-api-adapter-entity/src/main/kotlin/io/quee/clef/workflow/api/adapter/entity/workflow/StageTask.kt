package io.quee.clef.workflow.api.adapter.entity.workflow

import io.quee.api.develop.shared.model.IdentityStatus
import io.quee.clef.workflow.api.adapter.shared.entity.BaseIdentity
import io.quee.clef.workflow.api.domain.workflow.stage.task.StageTaskIdentity
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*
import kotlin.collections.ArrayList

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **18**, **Wed Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
@Entity
@Table
class StageTask(
        @Column(nullable = false, updatable = false) override var taskKey: String,
        @Column(nullable = false) override var taskName: String,
        @OneToMany(cascade = [CascadeType.MERGE, CascadeType.PERSIST]) override val actions: MutableList<TaskAction> = ArrayList(),
        @Id override var uuid: String = UUID.randomUUID().toString(),
        @Column(nullable = false) @Enumerated(EnumType.STRING) override var identityStatus: IdentityStatus = IdentityStatus.ENABLED,
        @Column(nullable = false) override var creationDate: LocalDateTime = LocalDateTime.now()
) : BaseIdentity(uuid, creationDate, identityStatus), StageTaskIdentity