# Observations:
1. Bird class contains all behaviours possible in any bird. This class will keep on extending based on new additions of bird types. = LESS MAINTAINABLE CODE!
2. Tight coupling of all behaviours at a single place, will lead to lesser readability and more error prone areas. Testing extensive code. (There can be some relation within methods)
3. IF-ELSE or Switch Ladder (Red Flag for SRP).