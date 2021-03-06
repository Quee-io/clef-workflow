package io.quee.clef.workflow.api.common.error

import io.quee.api.develop.shared.error.Error
import io.quee.clef.workflow.api.common.response.SharedResponse

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **14**, **Sat Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
object WorkflowResponses {
    val WORKFLOW_ACTIVATED_SUCCESS = SharedResponse("CLFWF-WF-1000", "Workflow activated successfully")
    val WORKFLOW_DISABLED_SUCCESS = SharedResponse("CLFWF-WF-1100", "Workflow disabled successfully")
    val WORKFLOW_DELETED_SUCCESS = SharedResponse("CLFWF-WF-1200", "Workflow deleted successfully")

    object Errors {
        val WORKFLOW_DOES_NOT_EXIST = Error("CLFWF-WF-1300", "Workflow does not exist.")
        val DUPLICATE_WORKFLOW_ERROR = Error("CLFWF-WF-1400", "Workflow already exist, Workflow key should be unique.")
        val INITIAL_STAGE_HAS_BEEN_ADDED_BEFORE = Error("CLFWF-WF-1300", "Workflow initial stage has been added before.")
        val WORKFLOW_DOES_NOT_HAVE_INITIAL_STAGE = Error("CLFWF-WF-1300", "Workflow does not have initial stage.")
    }
}