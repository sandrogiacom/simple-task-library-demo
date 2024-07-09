package com.giacom.task_library_demo.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tasks/")
class TaskDemoController() {

    @GetMapping
    fun listAllTasks(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello World")
    }

}
