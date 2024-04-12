public class ES2_matrici_bollettino {

    //ESERCIZIO 1)
    public static void invertiColonne(int[][] mxn, int col1, int col2) {
        for (int i = 0; i < mxn.length; i++) {
            int temp = mxn[i][col1];
            mxn[i][col1] = mxn[i][col2];
            mxn[i][col2] = temp;
        }
    }

    //ESERCIZIO 2)
    public static void invertiRighe(int[][] mxn, int rig1, int rig2) {
        int[] tempRow = mxn[rig1];
        mxn[rig1] = mxn[rig2];
        mxn[rig2] = tempRow;
    }

    //ESERCIZIO 3)
    public static boolean MatriceSimmetrica(int[][] mxn) {
        int n = mxn.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mxn[i][j] != mxn[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    //ESERCIZIO 4)
    public static void TrasponiMatrice(int[][] mxn) {
        int n = mxn.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mxn[i][j];
                mxn[i][j] = mxn[j][i];
                mxn[j][i] = temp;
            }
        }
    }

    //ESERCIZIO 5)

    public static void sommaElementiRiga(int[][] mxn, int[] Array) {
        for (int i = 0; i < mxn.length; i++) {
            int sommaRiga = 0;
            for (int j = 0; j < mxn[i].length; j++) {
                sommaRiga += mxn[i][j];
            }
            Array[i] = sommaRiga;
        }
    }

    //ESERCIZIO 6)

    public static void sommaElementiColonna(int[][] mxn, int[] Array) {
        for (int j = 0; j < mxn[0].length; j++) {
            int sommaColonna = 0;
            for (int i = 0; i < mxn.length; i++) {
                sommaColonna += mxn[i][j];
            }
            Array[j] = sommaColonna;
        }
    }

    //ESERCIZIO 7)

    public static void riempiElementiMatrice(int[][] mxn) {
        int n = mxn.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                mxn[i][j] = 1;
            }
            for (int j = i + 1; j < n; j++) {
                mxn[i][j] = 0;
            }
        }
    }

    //ESERCIZIO 8)

    public static void riempiMatrice(int[][] mxn) {
        int n = mxn.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                mxn[i][j] = 1;
            }
        }
    }

    //ESERCIZIO 9)

    public static boolean ElementiDiagonaleUguali(int[][] mxn) {
        int n = mxn.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (mxn[i][j] != mxn[1][0]) {
                    return false;
                }
            }
        }
        return true;
    }

//----------------------------------------------------------------------------------------------------------------------

    //TEST:
    public static void main(String[] args) {
        int[][] mxn = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Test esercizio 1
        invertiColonne(mxn, 0, 2);
        System.out.println("La matrice dopo l'inversione delle colonne:");
        StampaMatrice(mxn);

        // Test esercizio 2
        invertiRighe(mxn, 0, 2);
        System.out.println("La matrice dopo l'inversione delle righe:");
        StampaMatrice(mxn);

        // Test esercizio 3
        int[][] matriceSimmetrica = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        System.out.println("La matrice è simmetrica? " + MatriceSimmetrica(matriceSimmetrica));

        // Test esercizio 4
        TrasponiMatrice(mxn);
        System.out.println("La matrice dopo la trasposizione:");
        StampaMatrice(mxn);

        // Test esercizio 5
        int[] sommaRighe = new int[mxn.length];
        sommaElementiRiga(mxn, sommaRighe);
        System.out.println("La somma degli elementi per ogni riga:");
        for (int somma : sommaRighe) {
            System.out.print(somma + " ");
        }
        System.out.println();

        // Test esercizio 6
        int[] sommaColonne = new int[mxn[0].length];
        sommaElementiColonna(mxn, sommaColonne);
        System.out.println("La somma degli elementi per ogni colonna:");
        for (int somma : sommaColonne) {
            System.out.print(somma + " ");
        }
        System.out.println();

        // Test esercizio 7
        riempiElementiMatrice(mxn);
        System.out.println("La matrice dopo il riempimento degli elementi (triangolare inferiore):");
        StampaMatrice(mxn);

        // Reset matrice
        mxn = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // Test esercizio 8
        riempiMatrice(mxn);
        System.out.println("La matrice dopo il riempimento dei valori superiori (triangolare superiore):");
        StampaMatrice(mxn);

        // Test esercizio 9
        System.out.println("Gli elementi sotto la diagonale principale sono tutti uguali? " + ElementiDiagonaleUguali(mxn));
    }

    //STAMPA MATRICE:
    public static void StampaMatrice(int[][] mxn) {
        for (int[] rig : mxn) {
            for (int value : rig) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}