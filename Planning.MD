# Development Planning

### Main Strategy
- Do a post endpoint
- Accept body
- Validate inputs
- 1 and 2 input must be more than 0
- 1 and 2 unit must be of valid (meters,yards)
- Output unit must be valid (meters,yards)
- All are required, reject input if missing requirements
- Do calculation from a Java class. 
- Convert both to the desired output unit.
- Add both
- Return sum


### Test Strategy
- Exception thrown when missing input requirements
- Exception when invalid unit
- Exception negative numbers
- Test the unit conversion method
- Test the summation method


### Deployment Strategy
- Prod build ready

### Refactoring strategy
- Add more units available for conversion
- Conversion is done in a java class