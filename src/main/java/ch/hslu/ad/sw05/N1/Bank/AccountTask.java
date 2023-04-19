/*
 * Copyright 2022 Hochschule Luzern - Informatik.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.ad.sw05.N1.Bank;

/**
 * Bankauftrag, der der von einem Quell-Bankkonto einen Betrag an ein Ziel-Bankkonto überweist. Die
 * Überweisung wird in Mircoüberweisungen aufgeteilt.
 */
public final class AccountTask implements Runnable {

    private final BankAccount konto1;
    private final BankAccount konto2;
    private final int amount;

    /**
     * Erzeugt ein Bankauftrag für eine Überweisung von einem Bankkonto auf ein anderes Bankkonto.
     * @param konto1 Quell-Bankkonto
     * @param konto2 Ziel-Bankkonto
     * @param amount zu überweisender Betrag
     */
    public AccountTask(final BankAccount konto1, final BankAccount konto2, final int amount) {
        this.konto1 = konto1;
        this.konto2 = konto2;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (int n = 0; n < amount; n++) {
            konto1.transfer(konto2, 1);
        }
    }
}
