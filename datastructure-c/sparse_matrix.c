#include "stdio.h"

#define maxrow 5
#define maxcol 6

void transpose1() {
    int col, row;
    int matrix[maxrow][maxcol] = {
            {0, 0, 0, 3, 0, 0},
            {4, 0, 7, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 8},
            {0, 0, 5, 0, 0, 0}
    };
    int transpose[maxcol][maxrow];

    for (col = 0; col < maxcol; col++) {
        for (row = 0; row < maxrow; row++) {
            transpose[col][row] = matrix[row][col];
            printf(" %3d", transpose[col][row]);
        }
        printf("\n");
    }
}

/**
 * 기억 장소를 절약하며 전치행렬 구하기
 */
void transpose2() {
    int m, col, row, termsu, mrow, trow;
    // m은 원시 희박행렬의 최대 열의 수가 되고, termsu는 0이 아닌 항의 수
    int matrix[maxrow][maxcol] = {
            {5, 6, 5},
            {0, 3, 3},
            {1, 0, 4},
            {1, 2, 7},
            {3, 5, 8},
            {4, 2, 5}
    };
    int transpose[maxrow][maxcol];

    m = transpose[0][0] = matrix[0][1];
    transpose[0][1] = matrix[0][0];
    termsu = transpose[0][2] = matrix[0][2];

    if (termsu > 0) {
        // 0열, 1열 ... 5열 순으로 전치시키는 과정으로 O(mt)시간
        // mrow는 희박 행렬에 대한 행위 위치이고 trow는 전치되는 행위 위치
        trow = 1;
        for (col = 0, col < m; col++) {
            if (matrix[mrow][1] == col) {
                transpose[trow][0] = matrix[mrow][1];
                transpose[trow][1] = matrix[mrow][0];
                transpose[trow][2] = matrix[mrow][2];
                trow++;
            }
        }
    }

    // 전치행렬 출력
    for (row = 0; row < maxrow; row++) {
        for (col = 0; col < maxcol; col++) {
            printf(" %3d", transpose[row][col]);
            printf("\n");
        }
    }
}

/**
 * 기억장소 절약 및 속도 빠른 전치행렬 구하기
 */
void transpose3() {
    int m, mrow, trow, col, row, termsu;
    int matrix[maxrow][maxcol] = {
            {5,6,5},
            {0,3,3},
            {1,0,4},
            {1,2,7},
            {3,5,8},
            {4,2,5}
    };
    int transpose[6][3], num[6], pos[6];
    m = transpose[0][0] = matrix[0][1];
    transpose[0][1] = matrix[0][0];
    termsu = transpose[0][2] = matrix[0][2];
    if (termsu>0){
        // O(m)의 수행 시간
        for (col = 0;col<m;col++){
            num[col] = 0;
        }
        // O(t)의 수행 시간
        for (row=1;row<termsu;row++){
            num[matrix[row][1]] = num[matrix[row][1]] +1;
        }
        // O(m)의 수행시간
        pos[0] = 1;
        for (trow=1;trow<m;trow++){
            pos[trow] = pos[trow-1]+num[trow-1];
        }
        // 전치과정 O(t)의 수행 시간
        for(mrow=1;mrow<=termsu;mrow++){
            trow=pos[matrix[mrow][1]];
            transpose[trow][1]=matrix[mrow][0];
            transpose[trow][0]=matrix[mrow][1];
            transpose[trow][2]=matrix[mrow][2];
            pos[matrix[mrow][1]] = trow+1;
        }
        // 전치 행렬의 출력
        for (row=0;row<maxrow;row++){
            for(col=0;col<maxcol;col++){
                printf(" %3d", transpose[row][col]);
            }
            printf("\n");
        }
    }
}
