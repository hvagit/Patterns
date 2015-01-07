/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author Henrik
 */
class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;
 
    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }
 
    public void start() {
        processor.freeze();
        //ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        //processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}