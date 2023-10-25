-- SELECT ����
SELECT * FROM emp;
SELECT * FROM dept;

-- EMP ���̺��� ��� ����� �̸�, ����, �Ի����� �˻�
SELECT ename, job, hiredate FROM emp;

-- EMP ���̺��� �μ���ȣ�� 10�� �μ��� ����� �����ȣ, �̸�, ����, �޿��� �˻�
SELECT empno, ename, job, sal FROM emp WHERE deptno = 10;

-- EMP ���̺��� ������ SALESMAN�� ����� �̸�, ����, �޿� �˻�
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

-- emp���̺��� ������ SALESMAN�� ����� �̸�, ����, �޿�, ������ �˻�;
SELECT ename, job, sal as salary, sal*12+comm "Annual Salary"
FROM emp
WHERE job = 'SALESMAN'
ORDER BY "Annual Salary" DESC;

-- emp ���̺��� �޿��� ���� ���� �޴� ��� TOP 3
SELECT ename, job, sal, ROWNUM as ranking
FROM (SELECT ename, job, sal FROM emp ORDER BY sal DESC)
WHERE ROWNUM <= 3
ORDER BY ROWNUM;

-- ����޿����� ������ ������ �ݾ��� ���� ������ �޿��� �˻� (������ 10% ����)
-- alias�� "������ ������ �޿�"
SELECT ename, job, sal, sal*12*0.9 as "������ ������ �޿�"
FROM emp
ORDER BY 4 DESC
;

-- emp���̺��� comm�� ���� ���� �޴� ��� ������ ����
-- (COMM�� NULL�� �ƴ� �����)
SELECT ename, job, sal, comm
FROM emp
WHERE comm IS NOT NULL
ORDER BY comm DESC
;

-- ��ü ����� ���� �˻�
SELECT ename, sal, sal*12+NVL(comm,0) as AnnualSalary
FROM emp
;

-- EMP ���̺��� �μ���ȣ �˻�
SELECT DISTINCT (DEPTNO)
FROM EMP
ORDER BY DEPTNO;

-- LIKE ������ : Ư�� ���Ͽ� ���ϴ� ���� ��ȸ�� �� ��� (���ϵ� Ű�� �Բ� ���)
-- % : 0/1�� �̻��� ���ڿ� ��Ī
-- _ : 1���� ���ڿ� ��Ī
SELECT *
FROM EMP
WHERE HIREDATE LIKE '81%';