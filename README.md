## Synopsis

Console application with command interface for managing airline company. Simple version with data storage in JSON file and limited number of commands.  

#### Available commands:
<li> 
C_CAPACITY     : Calculates carrying capacity of aircraft
</li>
<li>
DISPLAY        : Displays aircraft sorted by flight range
</li>
<li>
EXIT           : Exits from command processor
</li>
<li>
FIND           : Finds aircraft by range of fuel consumption. Example: "find 100 1000 "
</li>
<li>
HELP           : Displays help info
</li>
<li>
T_CAPACITY     : Calculates total capacity of aircraft
</li> 

## Stack of technologies

Java 8, maven, Junit, lombock, GSon





## Task

Create console application “Airline”:
1. Define aircraft class hierarchy. There should be 3 levels of the hierarchy.
2. Create an airline company that stores airplanes.
3. Calculate total capacity and carrying capacity of all the aircraft in the airline.
4. Sort the aircrafts by flight range (from smaller to larger) and display it on screen.
5. Find aircraft corresponding to the specified range of fuel consumption parameters (liters per hour).

<ul>6. Console menu should contain following commands at bare minimum:
<li> 
 Calculate the total capacity and carrying capacity of all the aircraft in the airline.
 </li>
 <li>
 Display the list of aircraft of the company sorted by flight range.
 </li>
 <li> 
 Find airplanes corresponding to a given range of fuel consumption parameters.
 </li>   
</ul>
<ol>Application must meet the requirements:
<li>
Stick to java code convention.
  </li>
 <li>
Use OOP : classes, inheritance, polymorphism, encapsulation, interfaces, etc.
  </li>
 <li>
Each class must have a meaningful name and reasonable composition.
  </li>
 <li>
Inheritance should only be applied when it makes sense.
  </li>
 <li>
Classes must be correctly decomposed into packages
  </li>
 </ol>


<ol>Requirements for task design:
<li>  
Source code must be stored on GitHub, the applicant must provide read access to the repository.
  </li>
 <li> 
The code should be compiled by Java 8.
    </li>
 <li>
The project should be assembled with maven install command or gradle build (optionally).
    </li>
 <li>
Repository must contain root file README.MD with instructions for launching the application and any other necessary documentation for the application (in English).
    </li>
 <li>
Running the application should not require an application server or installation of any software except for Java and maven / gradle.
    </li>
 <li>
Data can be stored in any format.  Files can be (but not necessarily) used to store aircraft.
    </li>
 <li>
Opensource libraries and frameworks are allowed.
    </li>
</ol>
<ul>Evaluation criteria:
 <li>
functional correctness according to the technical requirements,
     </li>
 <li>
application usability,
       </li>
 <li>
readability, maintainability and compliance of the code with OOP and SOLID principles,
       </li>
 <li>
documentation for the application and  the code,
       </li>
 <li>
unit tests availability,
       </li>
 <li>
any non-standard technical solutions,
       </li>
 <li>
any additional features not specified in the technical requirements, but making the application more functional or convenient,
       </li>
 <li>
task execution time.
       </li>

  </ul>
