package ie.atu.sw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

    public class CsvWriter {

        public static void main(String[] args) {
            String filePath = "./src/benchmarking.csv";

            System.out.println("Writing to benchmarking.csv file: " + filePath);
            writeToCsvFile(filePath);

            System.out.println("Reading from benchmarking.csv file ");
            readFromCsvFile(filePath);
        }

        public static void writeToCsvFile(String filePath) {
            List<Benchmarking> bmList = new ArrayList<Benchmarking>();

            Benchmarking bm = new Benchmarking();
            bm.setSort("Bubble Sort");
            bm.set_100("0.254");
            bm.set_250("0.476");
            bm.set_500("0.536");
            bm.set_1000("0.773");
            bm.set_1750("1.405");
            bm.set_2500("2.614");
            bm.set_5000("10.421");
            bm.set_7500("24.987");
            bm.set_8500("");
            bm.set_10000("49.455");
            bmList.add(bm);

            bm = new Benchmarking();
            bm.setSort("Selection Sort");
            bm.set_100("0.173");
            bm.set_250("0.333");
            bm.set_500("1.152");
            bm.set_1000("1.631");
            bm.set_1750("1.696");
            bm.set_2500("2.572");
            bm.set_5000("10.263");
            bm.set_7500("23.972");
            bm.set_10000("44.857");
            bmList.add(bm);

            bm = new Benchmarking();
            bm.setSort("Merge Sort");
            bm.set_100("0.148");
            bm.set_250("0.049");
            bm.set_500("0.093");
            bm.set_1000("0.186");
            bm.set_1750("0.358");
            bm.set_2500("0.53");
            bm.set_5000("1.546");
            bm.set_7500("1.555");
            bm.set_10000("1.872");
            bmList.add(bm);

            bm = new Benchmarking();
            bm.setSort("Insertion Sort");
            bm.set_100("0.025");
            bm.set_250("0.126");
            bm.set_500("0.283");
            bm.set_1000("0.144");
            bm.set_1750("0.492");
            bm.set_2500("0.357");
            bm.set_5000("0.497");
            bm.set_7500("1.18");
            bm.set_10000("1.994");
            bmList.add(bm);

            bm = new Benchmarking();
            bm.setSort("Counting Sort");
            bm.set_100("0.316");
            bm.set_250("0.099");
            bm.set_500("0.171");
            bm.set_1000("0.285");
            bm.set_1750("0.416");
            bm.set_2500("0.197");
            bm.set_5000("0.209");
            bm.set_7500("0.31");
            bm.set_10000("0.435");
            bmList.add(bm);

            FileWriter fw = null;
            try {
                fw = new FileWriter(filePath);

                fw.append("Size, 100, 250, 500, 1000, 1750, 2500, 5000, 7500, 10000" + "\n");

                for (Benchmarking bml : bmList) {
                    fw.append(bml.getSort());
                    fw.append(",");
                    fw.append(bml.get_100());
                    fw.append(",");
                    fw.append(bml.get_250());
                    fw.append(",");
                    fw.append(bml.get_500());
                    fw.append(",");
                    fw.append(bml.get_1000());
                    fw.append(",");
                    fw.append(bml.get_1750());
                    fw.append(",");
                    fw.append(bml.get_2500());
                    fw.append(",");
                    fw.append(bml.get_5000());
                    fw.append(",");
                    fw.append(bml.get_7500());
                    fw.append(",");
                    fw.append(bml.get_8500());
                    fw.append(",");
                    fw.append(bml.get_10000());
                    fw.append("\n");
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    fw.flush();
                    fw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public static void readFromCsvFile(String filePath) {
            BufferedReader br = null;

            try {
                List<Benchmarking> bml = new ArrayList<Benchmarking>();
                String line = "";
                br = new BufferedReader(new FileReader(filePath));
                br.readLine();

                while ((line = br.readLine()) != null) {
                    String[] fields = line.split(",");

                    if (fields.length > 0) {
                        Benchmarking bm = new Benchmarking();
                        bm.setSort(fields[0]);
                        bm.set_100(fields[1]);
                        bm.set_250(fields[2]);
                        bm.set_500(fields[3]);
                        bm.set_1000(fields[4]);
                        bm.set_1750(fields[5]);
                        bm.set_2500(fields[6]);
                        bm.set_5000(fields[7]);
                        bm.set_7500(fields[8]);
                        bm.set_8500(fields[9]);
                        bm.set_10000(fields[10]);
                        bml.add(bm);
                    }
                }

                System.out.printf("%-14s %-9s %-9s %-9s %-9s %-9s %-9s %-9s %-9s %-9s", "Size", "100", "250", "500", "1000",
                        "1750", "2500", "5000", "7500", "8500", "10000");
                System.out.println();

                for (Benchmarking bm : bml) {
                    System.out.printf("%-14s %-9s %-9s %-9s %-9s %-9s %-9s %-9s %-9s %-9s", bm.getSort(), bm.get_100(),
                            bm.get_250(), bm.get_500(), bm.get_1000(), bm.get_1750(), bm.get_2500(), bm.get_5000(),
                            bm.get_7500(), bm.get_8500(), bm.get_10000());
                    System.out.println();
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

