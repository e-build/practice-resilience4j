package me.practice.resilience4j

import me.practice.resilience4j.exception.DummyException
import org.springframework.stereotype.Component

@Component
class PracticeCircuitBreakerComponent {
    fun foo(success: Boolean): String {
        if (success) {
            return "success"
        }
        throw DummyException()
    }
}
