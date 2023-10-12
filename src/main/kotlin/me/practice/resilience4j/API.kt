package me.practice.resilience4j

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController("/api")
class API(
    private val practiceRateLimiterComponent: PracticeRateLimiterComponent,
    private val practiceCircuitBreakerComponent: PracticeCircuitBreakerComponent,
) {
    @GetMapping("/ratelimiter")
    fun rateLimiter(
        @RequestParam success: Boolean,
    ): ResponseEntity<String> {
        return ResponseEntity.ok(
            practiceRateLimiterComponent.foo(success),
        )
    }

    @GetMapping("/circuitbreaker")
    fun circuitBreaker(
        @RequestParam success: Boolean,
    ): ResponseEntity<String> {
        return ResponseEntity.ok(
            practiceCircuitBreakerComponent.foo(success),
        )
    }

}
