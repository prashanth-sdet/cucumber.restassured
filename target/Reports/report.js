$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Feature2.feature");
formatter.feature({
  "name": "POST",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to practise data tables",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@data"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I practice data tables",
  "rows": [
    {
      "cells": [
        "Fields",
        "values"
      ]
    },
    {
      "cells": [
        "Value1",
        "uft"
      ]
    },
    {
      "cells": [
        "Value2",
        "cucumber"
      ]
    },
    {
      "cells": [
        "Value3",
        "selenium"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "Practicestepdefinitions.pracdatatables(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I practice data tables again",
  "rows": [
    {
      "cells": [
        "Fields",
        "values"
      ]
    },
    {
      "cells": [
        "Value1",
        "uft"
      ]
    },
    {
      "cells": [
        "Value2",
        "cucumber"
      ]
    },
    {
      "cells": [
        "Value3",
        "selenium"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Practicestepdefinitions.pracdatatables(String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I test step 89 definitions",
  "keyword": "And "
});
formatter.match({
  "location": "Practicestepdefinitions.testdatatables(int)"
});
formatter.result({
  "status": "passed"
});
});