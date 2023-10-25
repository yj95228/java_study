-- SELECT 구문
SELECT * FROM emp;
SELECT * FROM dept;

-- EMP 테이블에서 모든 사원의 이름, 업무, 입사일을 검색
SELECT ename, job, hiredate FROM emp;

-- EMP 테이블에서 부서번호가 10번 부서인 사원의 사원번호, 이름, 업무, 급여를 검색
SELECT empno, ename, job, sal FROM emp WHERE deptno = 10;

-- EMP 테이블에서 업무가 SALESMAN인 사원의 이름, 업무, 급여 검색
SELECT ename, job, sal
FROM EMP
WHERE JOB = 'SALESMAN'
;

/*
ORDER BY ASC | DESC
*/
SELECT ename, job, sal
FROM emp
WHERE job = 'SALESMAN'
ORDER BY sal ASC
;

-- emp테이블에서 업무가 SALESMAN인 사원의 이름, 업무, 급여, 연봉을 검색;
SELECT ename, job, sal as salary, sal*12+comm "Annual Salary"
FROM emp
WHERE job = 'SALESMAN'
ORDER BY "Annual Salary" DESC;

-- emp 테이블에서 급여를 가장 많이 받는 사원 TOP 3
SELECT ename, job, sal, ROWNUM as ranking
FROM (SELECT ename, job, sal FROM emp ORDER BY sal DESC)
WHERE ROWNUM <= 3
ORDER BY ROWNUM;

-- 사원급여에서 세금을 제외한 금액을 실제 수령한 급여로 검색 (세금을 10% 간주)
-- alias를 "실제로 수령한 급여"
SELECT ename, job, sal, sal*12*0.9 as "실제로 수령한 급여"
FROM emp
ORDER BY 4 DESC
;

-- emp테이블에서 comm을 가장 많이 받는 사원 순으로 정렬
-- (COMM이 NULL이 아닌 사원만)
SELECT ename, job, sal, comm
FROM emp
WHERE comm IS NOT NULL
ORDER BY comm DESC
;

-- 전체 사원의 연봉 검색
SELECT ename, sal, sal*12+NVL(comm,0) as AnnualSalary
FROM emp
;

-- EMP 테이블에서 부서번호 검색
SELECT DISTINCT (DEPTNO)
FROM EMP
ORDER BY DEPTNO;

-- LIKE 연산자 : 특정 패턴에 속하는 값을 조회할 때 사용 (와일드 키와 함께 사용)
-- % : 0/1개 이상의 문자열 매칭
-- _ : 1개의 문자와 매칭
SELECT *
FROM EMP
WHERE HIREDATE LIKE '81%';