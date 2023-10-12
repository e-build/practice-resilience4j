package me.practice.resilience4j

import org.springframework.stereotype.Component

@Component
class PracticeRateLimiterComponent {
    fun foo(call: Boolean): String {
        return "success"
    }
}
