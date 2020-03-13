package io.quee.api.develop.action.usecase.action

import io.quee.api.develop.usecase.model.UseCaseRequest

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **07**, **Sat Mar, 2020**
 * Project [**pazar-store**](https://pazar.store/)<br></br>
 */
interface Actionable<RQ : UseCaseRequest> {
    fun RQ.before()
    fun RQ.after()
}