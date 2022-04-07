package com.github.nhancom3d.serenityfwplugininteliji.services

import com.intellij.openapi.project.Project
import com.github.nhancom3d.serenityfwplugininteliji.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
