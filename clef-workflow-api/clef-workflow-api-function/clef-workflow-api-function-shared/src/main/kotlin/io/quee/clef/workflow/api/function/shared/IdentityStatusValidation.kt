package io.quee.clef.workflow.api.function.shared

import io.quee.api.develop.shared.func.Validator
import io.quee.api.develop.shared.model.IdentityStatus
import io.quee.clef.workflow.api.function.shared.validator.ActivateIdentityValidator
import io.quee.clef.workflow.api.function.shared.validator.DeactivateIdentityValidator
import io.quee.clef.workflow.api.function.shared.validator.DeleteIdentityValidator
import java.util.*

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **14**, **Sat Mar, 2020**
 * Project **clef-workflow** [Quee.IO](https://quee.io/)<br></br>
 */
class IdentityStatusValidation {
    private val statusBasedValidationMap: MutableMap<IdentityStatus, Validator<IdentityStatus>>

    fun IdentityStatus.validate(toStatus: IdentityStatus) {
        statusBasedValidationMap[this]?.run {
            toStatus.validate()
        }
    }

    init {
        statusBasedValidationMap = EnumMap(IdentityStatus::class.java)
        statusBasedValidationMap[IdentityStatus.ENABLED] = ActivateIdentityValidator()
        statusBasedValidationMap[IdentityStatus.DISABLED] = DeactivateIdentityValidator()
        statusBasedValidationMap[IdentityStatus.DELETED] = DeleteIdentityValidator()
    }
}