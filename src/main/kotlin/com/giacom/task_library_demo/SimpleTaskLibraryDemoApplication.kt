package com.giacom.task_library_demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication(scanBasePackages = ["com.giacom"])
@EnableJpaRepositories(basePackages = ["com.giacom.simpletask.adapters.output.repository"])
@EntityScan(basePackages = ["com.giacom.simpletask.adapters.output.repository.entity"])
class SimpleTaskLibraryDemoApplication

fun main(args: Array<String>) {
    runApplication<SimpleTaskLibraryDemoApplication>(*args)
}
