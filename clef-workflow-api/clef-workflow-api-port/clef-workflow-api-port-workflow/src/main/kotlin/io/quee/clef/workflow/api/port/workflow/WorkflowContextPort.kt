package io.quee.clef.workflow.api.port.workflow

import io.quee.clef.workflow.api.function.shared.IdentityAccessValidation
import io.quee.clef.workflow.api.function.shared.IdentityStatusValidation
import io.quee.clef.workflow.api.store.workflow.WorkflowStore
import io.quee.clef.workflow.api.usecase.domain.workflow.WorkflowDomainUseCaseFactoryImpl
import io.quee.clef.workflow.api.usecase.factory.domain.StageDomainUseCaseFactory
import io.quee.clef.workflow.api.usecase.factory.domain.WorkflowDomainUseCaseFactory
import io.quee.clef.workflow.api.usecase.factory.workflow.WorkflowUseCaseFactory
import io.quee.clef.workflow.api.usecase.workflow.WorkflowUseCaseFactoryImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **18**, **Wed Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
@Configuration
class WorkflowContextPort {
    @Bean
    fun workflowDomainUseCaseFactory(
            workflowStore: WorkflowStore,
            identityAccessValidation: IdentityAccessValidation,
            stageDomainUseCaseFactory: StageDomainUseCaseFactory
    ): WorkflowDomainUseCaseFactory =
            WorkflowDomainUseCaseFactoryImpl(workflowStore, identityAccessValidation, stageDomainUseCaseFactory)

    @Bean
    fun workflowUseCaseFactory(
            workflowStore: WorkflowStore,
            identityStatusValidation: IdentityStatusValidation,
            workflowDomainUseCaseFactory: WorkflowDomainUseCaseFactory
    ): WorkflowUseCaseFactory =
            WorkflowUseCaseFactoryImpl(workflowStore, identityStatusValidation, workflowDomainUseCaseFactory)
}