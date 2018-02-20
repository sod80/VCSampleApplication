package io.sasta.tjl.application.cucumber.stepdefs;

import io.sasta.tjl.application.VcSampleApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = VcSampleApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
