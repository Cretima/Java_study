#include <stdio.h>

#define	N	100
#pragma warning( disable : 4996 )

void main()
{
	int nMagicSqr[N][N];
	int nN;

	while (1) {
		void makeMagicSquare(int nMagicSqr[][N], int nN);
		void showMagicSquare(int nMagicSqr[][N], int nN);
		void checkMagicSquare(int nMagicSqr[][N], int nN);
		printf("? ");
		scanf("%d", &nN);
		if (nN <= 2 || nN > N)
			break;
		makeMagicSquare(nMagicSqr, nN);
		showMagicSquare(nMagicSqr, nN);
		checkMagicSquare(nMagicSqr, nN);
		putchar('\n');
	}
	printf("Bye, ....\n");
}

void makeMagicSquare(int nMagicSqr[][N], int nN)
{
	// 홀수인 경우
	// 이중 짝수인 경우
	// 단일 짝수인 경우
}

void OddMagicSquare(int nMagicSqr[][N], int nN, int nOrgRow, int nOrgCol, int nBgn)
{
	
}

void DblyEvenMagicSquare(int nMagicSqr[][N], int nN)
{
	// (i+j+1) 또는 (i-j)가 4의 배수 여부에 따라 ...
}

void SnglyEvenMagicSquare(int nMagicSqr[][N], int nN)
{
	static int nOrg[][2] = { {0, 0}, {1, 1}, {0, 1}, {1, 0} };
	int nH = nN / 2;
	int nSqr = nH * nH;
	for (int i = 0; i < 4; i++)
		OddMagicSquare(nMagicSqr, nH, nOrg[i][0] * nH, nOrg[i][1] * nH, i * nSqr);
	int nQ = nH / 2;
	void SwitchHalf(int nMagicSqr[][N], int nCol, int nHalf);
	for (int nCol = 0; nCol < nQ; nCol++)
		SwitchHalf(nMagicSqr, nCol, nH);
	for (int nCol = nH + nQ + 2; nCol < nN; nCol++)
		SwitchHalf(nMagicSqr, nCol, nH);
	void Swap(int& x, int& y);
	Swap(nMagicSqr[nQ][0], nMagicSqr[nQ + nH][0]);		// Left Center at 0-th SQR <--> Left Center at 2-th SQR
	Swap(nMagicSqr[nQ][nQ], nMagicSqr[nQ + nH][nQ]);	// Center cell at 0-th SQR <--> Center cell at 2-th SQR
}

void SwitchHalf(int nMagicSqr[][N], int nCol, int nHalf)
{
	void Swap(int& x, int& y);
	for (int nRow = 0; nRow < nHalf; nRow++)
		Swap(nMagicSqr[nRow][nCol], nMagicSqr[nRow + nHalf][nCol]);
}

void Swap(int& x, int& y)
{
	int t = x;
	x = y;
	y = t;
}

void showMagicSquare(int nMagicSqr[][N], int nN)
{
	char FMTsqr[] = "%2d ";
	FMTsqr[1] = (int)log10(nN * nN) + 0x31;
	printf("\n[마방진]\n");
	for (int nRow = 0; nRow < nN; nRow++) {
		for (int nCol = 0; nCol < nN; nCol++)
			printf(FMTsqr, nMagicSqr[nRow][nCol]);
		putchar('\n');
	}
}

void checkMagicSquare(int nMagicSqr[][N], int nN)
{
	void checkMagicSquareRow(int nMagicSqr[][N], int nN);
	void checkMagicSquareCol(int nMagicSqr[][N], int nN);
	void checkMagicSquareDgl(int nMagicSqr[][N], int nN, int nDir);
	checkMagicSquareRow(nMagicSqr, nN);
	checkMagicSquareCol(nMagicSqr, nN);
	printf("\n[대각선 검사]\n");
	checkMagicSquareDgl(nMagicSqr, nN, 0);
	checkMagicSquareDgl(nMagicSqr, nN, 1);
}

void checkMagicSquareRow(int nMagicSqr[][N], int nN)
{
	char FMThdr[] = "행 %2d: ", FMTchk[] = "%2d %c ";
	FMThdr[4] = (int)log10(nN - 1) + 0x31;
	FMTchk[1] = (int)log10(nN * nN) + 0x31;
	printf("\n[행 검사]\n");
	for (int nRow = 0; nRow < nN; nRow++) {
		printf(FMThdr, nRow);
		int nSum = 0;
		for (int nCol = 0; nCol < nN; nCol++) {
			nSum += nMagicSqr[nRow][nCol];
			char opr = (nCol == nN - 1) ? '=' : '+';
			printf(FMTchk, nMagicSqr[nRow][nCol], opr);
		}
		printf("%d\n", nSum);
	}
}

void checkMagicSquareCol(int nMagicSqr[][N], int nN)
{
	char FMThdr[] = "열 %2d: ", FMTchk[] = "%2d %c ";
	FMThdr[4] = (int)log10(nN - 1) + 0x31;
	FMTchk[1] = (int)log10(nN * nN) + 0x31;
	printf("\n[열 검사]\n");
	for (int nCol = 0; nCol < nN; nCol++) {
		printf(FMThdr, nCol);
		int nSum = 0;
		for (int nRow = 0; nRow < nN; nRow++) {
			nSum += nMagicSqr[nRow][nCol];
			char opr = (nRow == nN - 1) ? '=' : '+';
			printf(FMTchk, nMagicSqr[nRow][nCol], opr);
		}
		printf("%d\n", nSum);
	}
}

void checkMagicSquareDgl(int nMagicSqr[][N], int nN, int nDir)
{
	char FMThdr[] = "대 %2c: ", FMTchk[] = "%2d %c ";
	FMThdr[4] = (int)log10(nN - 1) + 0x31;
	FMTchk[1] = (int)log10(nN * nN) + 0x31;
	printf(FMThdr, nDir ? '/' : '\\');
	int nSum = 0;
	for (int i = 0; i < nN; i++) {
		int j = nDir ? nN - i - 1 : i;
		nSum += nMagicSqr[i][i];
		char opr = (i == nN - 1) ? '=' : '+';
		printf(FMTchk, nMagicSqr[i][j], opr);
	}
	printf("%d\n", nSum);
}
