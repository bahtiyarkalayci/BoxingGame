public class Match {

        fighter f1;
        fighter f2;
        int minWeight;
        int maxWeight;


        Match(fighter f1, fighter f2, int minWeight, int maxWeight ) {
            this.f1 = f1;
            this.f2 = f2;
            this.maxWeight = maxWeight;
            this.minWeight = minWeight;


        }
        public fighter firstRaid() {
            return Math.random() < 0.5 ? f1 : f2;

        }

        void run() {
            if (isCheck()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("====YENİ RAUND====");

                    // birinci ve ikinci sporcunun saglıgı sıfırdan büyük oldugunda devam edecvek dongu.

                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }

                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + "sağlık:" + this.f1.health);
                    System.out.println(this.f2.name + "sağlık:" + this.f2.health);


                }

            } else {
                System.out.println("sporcuların sikletleri  uymuyor");
            }
        }

        boolean isCheck() {
            return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);

        }

        boolean isWin() {// biri kazandı mı kazanmadı mı bulur.
            if (this.f1.health == 0) {
                System.out.println(this.f2.name + "kazandı");
                return true;

            }
            if (this.f2.health == 0) {
                System.out.println(this.f1.name + "kazandı");
                return true;

            }
            return false;
        }

    }

