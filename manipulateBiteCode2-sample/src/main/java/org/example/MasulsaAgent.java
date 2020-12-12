package org.example;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.JavaModule;

import java.lang.instrument.Instrumentation;

public class MasulsaAgent {
	public static void premain(String agentArgs, Instrumentation inst) {
		new AgentBuilder.Default()
						.type(ElementMatchers.any())
						.transform(new AgentBuilder.Transformer() {
							@Override
							public DynamicType.Builder<?> transform(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule) {
								return builder;
							}
						}).installOn(inst);
	}
}
