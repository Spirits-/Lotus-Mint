package com.github.spirits.lotusmint.services

import com.intellij.openapi.project.Project
import com.github.spirits.lotusmint.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
