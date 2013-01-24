GRAMMAR = rpn.g4
START = s
TESTFILE = test.rpn
PSOUT = out.ps
BINDIR = ./bin
ANTLRLIB = ./lib/antlr-4.0-complete.jar
ANTLR = java -jar ${ANTLRLIB}
CC = javac -cp ${ANTLRLIB}

run: rpn.g4
	@mkdir --parents ${BINDIR}
	${ANTLR} -o ${BINDIR} ${GRAMMAR}
	${CC} ${BINDIR}/*.java
	@echo Done

clean:
	@rm -rf ${BINDIR}
	@echo Done
