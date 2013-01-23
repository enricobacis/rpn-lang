TESTFILE = test.rpn
BINDIR = ./bin/

run: rpn.g4
	@mkdir --parents ./bin/
	java -jar /usr/local/lib/antlr-4.0-complete.jar -o ./bin/ rpn.g4
	javac -cp /usr/local/lib/antlr-4.0-complete.jar ./bin/*.java
	@echo Done

clean:
	@rm -rf ./bin/
	@echo Done

test-gui: ${TESTFILE}
	@cd ./bin/ && java org.antlr.v4.runtime.misc.TestRig rpn s -gui ../${TESTFILE}

test-tree: ${TESTFILE}
	@cd ./bin/ && java org.antlr.v4.runtime.misc.TestRig rpn s -tree ../${TESTFILE}

test-ps: ${TESTFILE}
	@cd ./bin/ && java org.antlr.v4.runtime.misc.TestRig rpn s -ps ../out.ps ../${TESTFILE}
