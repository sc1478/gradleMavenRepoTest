package com.whatever.dummy
import org.gradle.api.Plugin
import org.gradle.api.Project

import com.netflix.gradle.plugins.rpm.Rpm

class DummyRpmPlugin implements Plugin<Project> {
	private Rpm rpmTask;


	@Override
	public void apply(Project project) {
		project.plugins.apply('nebula.rpm')
		
		rpmTask = project.tasks.create("rpm", Rpm.class)
		
		rpmTask.doFirst {
			println "You big dummy!"
		}
	}

}
