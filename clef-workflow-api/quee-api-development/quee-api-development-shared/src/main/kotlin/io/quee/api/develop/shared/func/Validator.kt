package io.quee.api.develop.shared.func

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **Sat Aug, 2019**
 */
@FunctionalInterface
interface Validator<T> {
    fun validate(item: T)
}