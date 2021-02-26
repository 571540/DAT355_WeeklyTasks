# DAT355_WeeklyTasks

## Usage of EMF Forms - Week 4

See folder named "EMF_Forms". I have done only the compulsory tasks of this weeks assignment, task 1 and 4. No pending issues

- Families2Persons repository are for task 4
- Rest of the repositories are for task 1. I have only done RAP, not SWT or JavaFX.

## Using ETL - Week 5

See folder named "mt-lecture-main". I had some real problems with this one. For some reason, on task 2, my EGL run configuration won't work so I was not able generate the html folders. And task 3 was difficult, I wasn't able to complete it. I wish there were more documentation on the epsilon languages besides https://www.eclipse.org/epsilon/doc/. I tried to write the code in the .etl file but did not get very far. I overall think the descriptions for task 2 and 3 were too vague and was hard to understand how to actually solve them. I apologise for not being able to fully complete the task 2 and 3, but I tried.

### Task 1.1
Bowling model from assignment 1 - Model-to-text
-	Out-place
-	Heterogenous
-	Declarative

Families2Persons from assignment 2- Model-to-model
-	Out-place
-	Heterogenous
-	Imperative

### Task 1.2

Yes, I would consider the different components of a compiler as model transformations since model transformation is about taking models and converting them to other software artifacts like code etc. in an automated way, and the compiler plays a hand in this. We have transformations like endogenous and exogenous transformation. Endogenous converts a source model to a target model and both models conform to the same meta-model. This type of model transformation is used to perform tasks such as model refactoring and optimization. Exogenous converts a source model to a target model and both models conform into different meta-models. This type of transformation is used handle tasks such as code generation and reverse engineering. Lexer uses text-to-model transformation. With parsers, the compiler parses programs into graphs/tree structures based on the language’s syntax, basically text-to-model transformation. With optimizer, the compiler takes the created syntax model and makes a new version of it with optimized improvements. Lastly, code generator is often used for model-to-text transformations.

### Task 2 & 3

See folders named Exercise 1 and Exercise 3

## Create DSL - Week 8

See folder "CreateDSL". I have followed step 1 and 3, and created a metamodel which is more or less the same as in the timedStateMachine-project, generated code and developed textual concrete syntax with Xtext. You can find this in the "stateMachineDSL"-folder. 

Next I tried to create a graphical interface by following the sirius-mindstorm videos on youtube. However, it is only halfway complete. I've added new icons and added the classes to my stateMachine Diagram with relation-features, but when I was suppose to add the relational arrows, it would not work no matter how hard I tried. Without those, the rest could not be done properly. I tried many hours to get it to work. The files containing this is in the "runtime-stateMachine"-folder. 

See the folder "CreateDSL/images" to see how far I got. PS, the images are wide so you have to scroll to the right to see everything.

