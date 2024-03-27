package NewHomework1.chap6_MY;

class Polynomial implements Comparable<Polynomial>{
    double coef;           // 계수
    int    exp;            // 지수
    
    public Polynomial(double coef, int exp) {
        this.coef = coef;
        this.exp = exp;
    }

    public int compareTo(Polynomial other) { 
    	//크면 +1 , 같으면 0 , 작으면-1
        return this.exp - other.exp;
    }

}
public class Test_다항식merge연산 {

	static void merge(Polynomial[] a, int lefta, int righta, int leftb, int rightb ) {
		//두 다항식을 합병하는거 작성
		Polynomial []temp = new Polynomial[a.length]; //temp는 a배열과 동일한 길이 
		int p=lefta , q=leftb;
		int ix=0;

		while(lefta <=righta && leftb <= rightb) {
			if(lefta <= leftb) {
				temp[ix++]=a[p++];
			}
			else {
				temp[ix++]=a[q++];
			}
			
		}		
		while(lefta <= righta) {
			temp[ix++]=a[p++];
		}
		while(leftb <=rightb) {
			temp[ix++]=a[q++];
		}
		
	}
	
	// 다항식 덧셈 연산
    static void AddPolynomial(Polynomial[] a, Polynomial[] b, Polynomial[] result) {
    	//이 부분 gpt사용, 다시해볼것
    	int indexA = 0, indexB = 0, indexResult = 0;

        while (indexA < a.length && indexB < b.length) {
            if (a[indexA].exp > b[indexB].exp) {
                result[indexResult++] = new Polynomial(a[indexA].coef, a[indexA].exp);
                indexA++;
            } else if (a[indexA].exp < b[indexB].exp) {
                result[indexResult++] = new Polynomial(b[indexB].coef, b[indexB].exp);
                indexB++;
            } else {
                double sumOfCoefficients = a[indexA].coef + b[indexB].coef;
                if (sumOfCoefficients != 0) {
                    result[indexResult++] = new Polynomial(sumOfCoefficients, a[indexA].exp);
                }
                indexA++;
                indexB++;
            }
        }

        while (indexA < a.length) {
            result[indexResult++] = new Polynomial(a[indexA].coef, a[indexA].exp);
            indexA++;
        }

        while (indexB < b.length) {
            result[indexResult++] = new Polynomial(b[indexB].coef, b[indexB].exp);
            indexB++;
        }
    }

    
    // 다항식 곱셈 연산
    static void MultiplyPolynomial(Polynomial[] a, Polynomial[] b, Polynomial[] result) {
    	
    	for (int i=0; i<a.length; i++ )
    		for (int j=0; j<b.length; j++) {
    			 int exp = a[i].exp + b[j].exp;
    	         double coef = a[i].coef * b[j].coef;
    		}
    	
    }
	 static void ShowPolynomial(Polynomial[] a) {
	        for (Polynomial p : a) {
	            System.out.println(p.coef + "x^" + p.exp);
	        }
	        System.out.println();
	    }
	 
	// --- 퀵 정렬(비재귀 버전)---//
	static void MergeSort(Polynomial[] a, int left, int right) {
		int mid = (left+right)/2;
		if (left == right) return;
		MergeSort(a, left, mid);
		MergeSort(a, mid+1, right);
		merge(a, left, mid, mid+1, right);
		return;
	}

	public static void main(String[] args) {
		Polynomial[] x = {
		         new Polynomial(1.5, 3),
		         new Polynomial(2.5, 7),
		         new Polynomial(3.3, 2),
		         new Polynomial(4.0, 1),
		         new Polynomial(2.2, 0),
		         new Polynomial(3.1, 4),
		         new Polynomial(3.8, 5),
		     };
		Polynomial[] y = {
		         new Polynomial(1.5, 1),
		         new Polynomial(2.5, 2),
		         new Polynomial(3.3, 3),
		         new Polynomial(4.0, 0),
		         new Polynomial(2.2, 4),
		         new Polynomial(3.1, 5),
		         new Polynomial(3.8, 6),
		     };
		int nx = x.length;

		
		
		ShowPolynomial(x);
		ShowPolynomial(y);
		MergeSort(x, 0, x.length - 1); // 배열 x를 퀵정렬
		MergeSort(y, 0, y.length - 1); // 배열 x를 퀵정렬
		ShowPolynomial(x);
		ShowPolynomial(y);
		Polynomial[] z = new Polynomial[20];
		AddPolynomial(x,y,z);//다항식 덧셈 z = x + y 머지 
		ShowPolynomial(z);
		ShowPolynomial(y);
		MultiplyPolynomial(x,y,z);//다항식 곱셈 z = x * y
		ShowPolynomial(y);
//		int result = EvaluatePolynomial(z, 10);//다항식 값 계산 함수 z(10) 값 계산한다 
//		System.out.println(" result = " + result );
	}
}
