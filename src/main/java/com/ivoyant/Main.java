package com.ivoyant;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "greeting", defaultPhase = LifecyclePhase.COMPILE)
public class Main extends AbstractMojo {
    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    MavenProject mavenProject;
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hello World");
    }
}
