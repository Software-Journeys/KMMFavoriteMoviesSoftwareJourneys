package com.example.kmmfavoritemoviessoftwarejourneys

class Greeting {
    fun greeting() = "Hello, ${Platform().platform.reversed()}!" +
            "\nThere are only ${daysUntilNewYear()} left until New Year! 🎅🏼 "
}